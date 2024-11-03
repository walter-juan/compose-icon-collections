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

public val Twbs.SignRailroad: ImageVector
    get() {
        if (_signRailroad != null) {
            return _signRailroad!!
        }
        _signRailroad = Builder(name = "SignRailroad", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.303f, 6.584f)
                horizontalLineToRelative(1.064f)
                curveToRelative(0.592f, 0.0f, 0.936f, 0.334f, 0.936f, 0.844f)
                arcToRelative(0.79f, 0.79f, 0.0f, false, true, -0.485f, 0.748f)
                lineToRelative(0.536f, 1.074f)
                horizontalLineToRelative(-0.59f)
                lineToRelative(-0.467f, -0.994f)
                horizontalLineToRelative(-0.473f)
                verticalLineToRelative(0.994f)
                horizontalLineToRelative(-0.521f)
                close()
                moveTo(11.824f, 6.998f)
                verticalLineToRelative(0.861f)
                horizontalLineToRelative(0.46f)
                curveToRelative(0.292f, 0.0f, 0.474f, -0.14f, 0.474f, -0.421f)
                curveToRelative(0.0f, -0.286f, -0.188f, -0.44f, -0.467f, -0.44f)
                close()
                moveTo(3.053f, 6.584f)
                horizontalLineToRelative(1.064f)
                curveToRelative(0.592f, 0.0f, 0.936f, 0.334f, 0.936f, 0.844f)
                curveToRelative(0.0f, 0.39f, -0.242f, 0.654f, -0.485f, 0.748f)
                lineToRelative(0.536f, 1.074f)
                horizontalLineToRelative(-0.59f)
                lineToRelative(-0.467f, -0.994f)
                horizontalLineToRelative(-0.473f)
                verticalLineToRelative(0.994f)
                horizontalLineToRelative(-0.521f)
                close()
                moveTo(3.574f, 6.998f)
                verticalLineToRelative(0.861f)
                horizontalLineToRelative(0.46f)
                curveToRelative(0.292f, 0.0f, 0.474f, -0.14f, 0.474f, -0.421f)
                curveToRelative(0.0f, -0.286f, -0.188f, -0.44f, -0.467f, -0.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.95f, 0.435f)
                curveToRelative(0.58f, -0.58f, 1.52f, -0.58f, 2.1f, 0.0f)
                lineToRelative(6.515f, 6.516f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.519f, 0.0f, 2.098f)
                lineTo(9.05f, 15.565f)
                curveToRelative(-0.58f, 0.58f, -1.519f, 0.58f, -2.098f, 0.0f)
                lineTo(0.435f, 9.05f)
                arcToRelative(1.48f, 1.48f, 0.0f, false, true, 0.0f, -2.098f)
                close()
                moveTo(8.35f, 1.135f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, -0.7f, 0.0f)
                lineTo(4.923f, 3.861f)
                lineTo(8.0f, 6.939f)
                lineToRelative(3.078f, -3.077f)
                lineTo(8.35f, 1.134f)
                close()
                moveTo(12.138f, 4.923f)
                lineTo(9.061f, 8.0f)
                lineToRelative(3.077f, 3.078f)
                lineToRelative(2.728f, -2.728f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, 0.0f, -0.7f)
                close()
                moveTo(11.078f, 12.138f)
                lineTo(8.0f, 9.061f)
                lineToRelative(-3.077f, 3.077f)
                lineToRelative(2.727f, 2.728f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, 0.7f, 0.0f)
                close()
                moveTo(3.862f, 11.078f)
                lineTo(6.939f, 8.0f)
                lineTo(3.862f, 4.923f)
                lineTo(1.134f, 7.65f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, 0.0f, 0.7f)
                close()
            }
        }
        .build()
        return _signRailroad!!
    }

private var _signRailroad: ImageVector? = null
