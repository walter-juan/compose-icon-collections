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

public val Twbs.Badge8kFill: ImageVector
    get() {
        if (_badge8kFill != null) {
            return _badge8kFill!!
        }
        _badge8kFill = Builder(name = "Badge8kFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9f, 6.605f)
                curveToRelative(0.0f, 0.51f, 0.405f, 0.866f, 0.95f, 0.866f)
                reflectiveCurveToRelative(0.945f, -0.356f, 0.945f, -0.866f)
                reflectiveCurveToRelative(-0.4f, -0.852f, -0.945f, -0.852f)
                reflectiveCurveToRelative(-0.95f, 0.343f, -0.95f, 0.852f)
                moveToRelative(-0.192f, 2.668f)
                curveToRelative(0.0f, 0.589f, 0.492f, 0.984f, 1.142f, 0.984f)
                curveToRelative(0.646f, 0.0f, 1.143f, -0.395f, 1.143f, -0.984f)
                reflectiveCurveTo(5.496f, 8.28f, 4.85f, 8.28f)
                curveToRelative(-0.65f, 0.0f, -1.142f, 0.404f, -1.142f, 0.993f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(16.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(7.17f, 9.348f)
                curveToRelative(0.0f, 1.041f, -0.927f, 1.766f, -2.333f, 1.766f)
                reflectiveCurveToRelative(-2.312f, -0.72f, -2.312f, -1.762f)
                curveToRelative(0.0f, -0.954f, 0.712f, -1.384f, 1.257f, -1.494f)
                verticalLineToRelative(-0.053f)
                curveToRelative(-0.51f, -0.154f, -1.02f, -0.558f, -1.02f, -1.331f)
                curveToRelative(0.0f, -0.914f, 0.831f, -1.587f, 2.088f, -1.587f)
                curveToRelative(1.253f, 0.0f, 2.083f, 0.673f, 2.083f, 1.587f)
                curveToRelative(0.0f, 0.782f, -0.523f, 1.182f, -1.02f, 1.331f)
                verticalLineToRelative(0.053f)
                curveToRelative(0.545f, 0.11f, 1.257f, 0.545f, 1.257f, 1.49f)
                moveTo(12.102f, 5.0f)
                horizontalLineToRelative(1.306f)
                lineToRelative(-2.14f, 2.584f)
                lineToRelative(2.232f, 3.415f)
                horizontalLineToRelative(-1.428f)
                lineToRelative(-1.679f, -2.624f)
                lineToRelative(-0.615f, 0.699f)
                verticalLineToRelative(1.925f)
                lineTo(8.59f, 10.999f)
                lineTo(8.59f, 5.0f)
                horizontalLineToRelative(1.187f)
                verticalLineToRelative(2.685f)
                horizontalLineToRelative(0.057f)
                close()
            }
        }
        .build()
        return _badge8kFill!!
    }

private var _badge8kFill: ImageVector? = null
