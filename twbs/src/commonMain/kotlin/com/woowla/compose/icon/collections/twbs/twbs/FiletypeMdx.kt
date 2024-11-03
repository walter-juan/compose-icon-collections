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

public val Twbs.FiletypeMdx: ImageVector
    get() {
        if (_filetypeMdx != null) {
            return _filetypeMdx!!
        }
        _filetypeMdx = Builder(name = "FiletypeMdx", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 4.5f)
                lineTo(14.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                verticalLineToRelative(-1.0f)
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
                moveTo(0.706f, 15.849f)
                verticalLineToRelative(-2.66f)
                horizontalLineToRelative(0.038f)
                lineToRelative(0.952f, 2.159f)
                horizontalLineToRelative(0.516f)
                lineToRelative(0.946f, -2.16f)
                horizontalLineToRelative(0.038f)
                verticalLineToRelative(2.661f)
                horizontalLineToRelative(0.715f)
                lineTo(3.911f, 11.85f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(-1.14f, 2.596f)
                horizontalLineToRelative(-0.026f)
                lineTo(0.805f, 11.85f)
                lineTo(0.0f, 11.85f)
                verticalLineToRelative(3.999f)
                close()
                moveTo(4.265f, 11.85f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(1.459f)
                quadToRelative(0.603f, 0.0f, 0.999f, -0.237f)
                arcToRelative(1.45f, 1.45f, 0.0f, false, false, 0.595f, -0.689f)
                quadToRelative(0.195f, -0.45f, 0.196f, -1.084f)
                quadToRelative(0.0f, -0.63f, -0.196f, -1.075f)
                arcToRelative(1.43f, 1.43f, 0.0f, false, false, -0.59f, -0.68f)
                quadToRelative(-0.395f, -0.234f, -1.004f, -0.234f)
                close()
                moveTo(5.055f, 12.495f)
                horizontalLineToRelative(0.563f)
                quadToRelative(0.372f, 0.0f, 0.61f, 0.152f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, 0.354f, 0.454f)
                quadToRelative(0.117f, 0.302f, 0.117f, 0.753f)
                quadToRelative(0.0f, 0.34f, -0.067f, 0.592f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, -0.196f, 0.422f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.334f, 0.252f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -0.484f, 0.082f)
                horizontalLineToRelative(-0.562f)
                verticalLineToRelative(-2.707f)
                close()
                moveTo(9.842f, 11.85f)
                horizontalLineToRelative(0.894f)
                lineTo(9.46f, 13.857f)
                lineToRelative(1.254f, 1.992f)
                horizontalLineToRelative(-0.908f)
                lineToRelative(-0.85f, -1.415f)
                horizontalLineToRelative(-0.035f)
                lineToRelative(-0.852f, 1.415f)
                horizontalLineToRelative(-0.862f)
                lineToRelative(1.24f, -2.016f)
                lineTo(7.22f, 11.85f)
                horizontalLineToRelative(0.932f)
                lineToRelative(0.832f, 1.439f)
                horizontalLineToRelative(0.035f)
                close()
            }
        }
        .build()
        return _filetypeMdx!!
    }

private var _filetypeMdx: ImageVector? = null
