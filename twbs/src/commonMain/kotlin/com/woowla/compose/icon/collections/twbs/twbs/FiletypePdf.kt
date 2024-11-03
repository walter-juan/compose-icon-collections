package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.FiletypePdf: ImageVector
    get() {
        if (_filetypePdf != null) {
            return _filetypePdf!!
        }
        _filetypePdf = Builder(name = "FiletypePdf", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 4.5f)
                lineTo(14.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(13.0f, 4.5f)
                horizontalLineToRelative(-2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 3.0f)
                lineTo(9.5f, 1.0f)
                lineTo(4.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                lineTo(2.0f, 11.0f)
                lineTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(1.6f, 11.85f)
                lineTo(0.0f, 11.85f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(0.791f)
                verticalLineToRelative(-1.342f)
                horizontalLineToRelative(0.803f)
                quadToRelative(0.43f, 0.0f, 0.732f, -0.173f)
                quadToRelative(0.305f, -0.175f, 0.463f, -0.474f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, 0.161f, -0.677f)
                quadToRelative(0.0f, -0.375f, -0.158f, -0.677f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.46f, -0.477f)
                quadToRelative(-0.3f, -0.18f, -0.732f, -0.179f)
                moveToRelative(0.545f, 1.333f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.085f, 0.38f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, true, -0.238f, 0.241f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.375f, 0.082f)
                lineTo(0.788f, 13.886f)
                lineTo(0.788f, 12.48f)
                horizontalLineToRelative(0.66f)
                quadToRelative(0.327f, 0.0f, 0.512f, 0.181f)
                quadToRelative(0.185f, 0.183f, 0.185f, 0.522f)
                moveToRelative(1.217f, -1.333f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(1.46f)
                quadToRelative(0.602f, 0.0f, 0.998f, -0.237f)
                arcToRelative(1.45f, 1.45f, 0.0f, false, false, 0.595f, -0.689f)
                quadToRelative(0.196f, -0.45f, 0.196f, -1.084f)
                quadToRelative(0.0f, -0.63f, -0.196f, -1.075f)
                arcToRelative(1.43f, 1.43f, 0.0f, false, false, -0.589f, -0.68f)
                quadToRelative(-0.396f, -0.234f, -1.005f, -0.234f)
                close()
                moveTo(4.153f, 12.495f)
                horizontalLineToRelative(0.563f)
                quadToRelative(0.371f, 0.0f, 0.609f, 0.152f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, 0.354f, 0.454f)
                quadToRelative(0.118f, 0.302f, 0.118f, 0.753f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, -0.068f, 0.592f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, -0.196f, 0.422f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.334f, 0.252f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -0.483f, 0.082f)
                horizontalLineToRelative(-0.563f)
                close()
                moveTo(7.896f, 14.258f)
                verticalLineToRelative(1.591f)
                horizontalLineToRelative(-0.79f)
                lineTo(7.106f, 11.85f)
                horizontalLineToRelative(2.548f)
                verticalLineToRelative(0.653f)
                lineTo(7.896f, 12.503f)
                verticalLineToRelative(1.117f)
                horizontalLineToRelative(1.606f)
                verticalLineToRelative(0.638f)
                close()
            }
        }
        .build()
        return _filetypePdf!!
    }

private var _filetypePdf: ImageVector? = null
