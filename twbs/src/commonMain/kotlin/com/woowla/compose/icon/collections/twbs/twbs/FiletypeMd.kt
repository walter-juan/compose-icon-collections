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

public val Twbs.FiletypeMd: ImageVector
    get() {
        if (_filetypeMd != null) {
            return _filetypeMd!!
        }
        _filetypeMd = Builder(name = "FiletypeMd", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 4.5f)
                lineTo(14.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(9.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
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
                moveTo(0.706f, 13.189f)
                verticalLineToRelative(2.66f)
                lineTo(0.0f, 15.849f)
                lineTo(0.0f, 11.85f)
                horizontalLineToRelative(0.806f)
                lineToRelative(1.14f, 2.596f)
                horizontalLineToRelative(0.026f)
                lineToRelative(1.14f, -2.596f)
                horizontalLineToRelative(0.8f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(-0.716f)
                verticalLineToRelative(-2.66f)
                horizontalLineToRelative(-0.038f)
                lineToRelative(-0.946f, 2.159f)
                horizontalLineToRelative(-0.516f)
                lineToRelative(-0.952f, -2.16f)
                lineTo(0.706f, 13.188f)
                close()
                moveTo(4.625f, 15.849f)
                lineTo(4.625f, 11.85f)
                horizontalLineToRelative(1.459f)
                quadToRelative(0.609f, 0.0f, 1.005f, 0.234f)
                reflectiveQuadToRelative(0.589f, 0.68f)
                quadToRelative(0.195f, 0.445f, 0.196f, 1.075f)
                quadToRelative(0.0f, 0.634f, -0.196f, 1.084f)
                quadToRelative(-0.197f, 0.451f, -0.595f, 0.689f)
                quadToRelative(-0.396f, 0.237f, -1.0f, 0.237f)
                lineTo(4.626f, 15.849f)
                close()
                moveTo(5.978f, 12.495f)
                horizontalLineToRelative(-0.562f)
                verticalLineToRelative(2.707f)
                horizontalLineToRelative(0.562f)
                quadToRelative(0.279f, 0.0f, 0.484f, -0.082f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.334f, -0.252f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 0.196f, -0.422f)
                quadToRelative(0.067f, -0.252f, 0.067f, -0.592f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -0.117f, -0.753f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, -0.354f, -0.454f)
                quadToRelative(-0.238f, -0.152f, -0.61f, -0.152f)
            }
        }
        .build()
        return _filetypeMd!!
    }

private var _filetypeMd: ImageVector? = null
