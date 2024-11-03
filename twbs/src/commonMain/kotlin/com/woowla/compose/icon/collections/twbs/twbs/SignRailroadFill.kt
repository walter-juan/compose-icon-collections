package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.SignRailroadFill: ImageVector
    get() {
        if (_signRailroadFill != null) {
            return _signRailroadFill!!
        }
        _signRailroadFill = Builder(name = "SignRailroadFill", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.05f, 0.435f)
                curveToRelative(-0.58f, -0.58f, -1.52f, -0.58f, -2.1f, 0.0f)
                lineTo(4.224f, 3.162f)
                lineTo(8.0f, 6.94f)
                lineToRelative(3.777f, -3.777f)
                lineTo(9.049f, 0.435f)
                close()
                moveTo(12.324f, 7.86f)
                verticalLineToRelative(-0.862f)
                horizontalLineToRelative(0.467f)
                curveToRelative(0.28f, 0.0f, 0.467f, 0.154f, 0.467f, 0.44f)
                curveToRelative(0.0f, 0.28f, -0.182f, 0.421f, -0.475f, 0.421f)
                horizontalLineToRelative(-0.459f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.838f, 4.223f)
                lineTo(9.06f, 8.0f)
                lineToRelative(3.777f, 3.777f)
                lineToRelative(2.727f, -2.728f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.519f, 0.0f, -2.098f)
                close()
                moveTo(12.868f, 6.584f)
                curveToRelative(0.591f, 0.0f, 0.935f, 0.334f, 0.935f, 0.844f)
                arcToRelative(0.79f, 0.79f, 0.0f, false, true, -0.485f, 0.748f)
                lineToRelative(0.536f, 1.074f)
                horizontalLineToRelative(-0.59f)
                lineToRelative(-0.467f, -0.994f)
                horizontalLineToRelative(-0.473f)
                verticalLineToRelative(0.994f)
                horizontalLineToRelative(-0.521f)
                lineTo(11.803f, 6.584f)
                horizontalLineToRelative(1.064f)
                close()
                moveTo(11.777f, 12.838f)
                lineTo(8.0f, 9.06f)
                lineToRelative(-3.777f, 3.777f)
                lineToRelative(2.728f, 2.727f)
                curveToRelative(0.58f, 0.58f, 1.519f, 0.58f, 2.098f, 0.0f)
                close()
                moveTo(2.824f, 6.998f)
                verticalLineToRelative(0.861f)
                horizontalLineToRelative(0.46f)
                curveToRelative(0.292f, 0.0f, 0.474f, -0.14f, 0.474f, -0.421f)
                curveToRelative(0.0f, -0.286f, -0.188f, -0.44f, -0.467f, -0.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.162f, 11.777f)
                lineTo(6.94f, 8.0f)
                lineTo(3.162f, 4.223f)
                lineTo(0.435f, 6.951f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.519f, 0.0f, 2.098f)
                close()
                moveTo(2.302f, 6.584f)
                horizontalLineToRelative(1.065f)
                curveToRelative(0.592f, 0.0f, 0.936f, 0.334f, 0.936f, 0.844f)
                curveToRelative(0.0f, 0.39f, -0.242f, 0.654f, -0.485f, 0.748f)
                lineToRelative(0.536f, 1.074f)
                horizontalLineToRelative(-0.59f)
                lineToRelative(-0.467f, -0.994f)
                horizontalLineToRelative(-0.473f)
                verticalLineToRelative(0.994f)
                horizontalLineToRelative(-0.521f)
                lineTo(2.303f, 6.584f)
                close()
            }
        }
        .build()
        return _signRailroadFill!!
    }

private var _signRailroadFill: ImageVector? = null
