package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlAndroid: ImageVector
    get() {
        if (_bxlAndroid != null) {
            return _bxlAndroid!!
        }
        _bxlAndroid = Builder(name = "BxlAndroid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.344f, 8.71f)
                curveToRelative(-0.707f, 0.0f, -1.279f, 0.572f, -1.279f, 1.278f)
                verticalLineToRelative(4.53f)
                arcToRelative(1.278f, 1.278f, 0.0f, true, false, 2.558f, 0.0f)
                verticalLineToRelative(-4.53f)
                curveToRelative(0.0f, -0.706f, -0.572f, -1.278f, -1.279f, -1.278f)
                close()
                moveTo(5.656f, 8.71f)
                curveToRelative(-0.707f, 0.0f, -1.279f, 0.572f, -1.279f, 1.278f)
                verticalLineToRelative(4.53f)
                arcToRelative(1.278f, 1.278f, 0.0f, true, false, 2.558f, 0.0f)
                verticalLineToRelative(-4.53f)
                arcTo(1.277f, 1.277f, 0.0f, false, false, 5.656f, 8.71f)
                close()
                moveTo(14.545f, 4.901f)
                lineTo(15.313f, 3.513f)
                arcToRelative(0.343f, 0.343f, 0.0f, false, false, -0.133f, -0.47f)
                arcToRelative(0.344f, 0.344f, 0.0f, false, false, -0.471f, 0.135f)
                lineToRelative(-0.789f, 1.42f)
                curveToRelative(-0.588f, -0.235f, -1.236f, -0.368f, -1.92f, -0.368f)
                reflectiveCurveToRelative(-1.332f, 0.132f, -1.92f, 0.367f)
                lineToRelative(-0.789f, -1.418f)
                arcToRelative(0.344f, 0.344f, 0.0f, false, false, -0.471f, -0.135f)
                arcToRelative(0.345f, 0.345f, 0.0f, false, false, -0.133f, 0.47f)
                lineToRelative(0.768f, 1.388f)
                curveTo(8.072f, 5.69f, 7.148f, 7.099f, 7.148f, 8.71f)
                curveToRelative(0.0f, 0.011f, 0.0f, 0.021f, 0.002f, 0.034f)
                curveToRelative(-0.002f, 0.006f, -0.002f, 0.013f, -0.002f, 0.019f)
                verticalLineToRelative(0.001f)
                horizontalLineToRelative(9.703f)
                lineTo(16.851f, 8.71f)
                curveToRelative(0.001f, -1.611f, -0.923f, -3.019f, -2.306f, -3.809f)
                close()
                moveTo(9.76f, 6.869f)
                arcToRelative(0.346f, 0.346f, 0.0f, true, true, 0.005f, -0.693f)
                arcToRelative(0.346f, 0.346f, 0.0f, false, true, -0.005f, 0.693f)
                close()
                moveTo(14.24f, 6.869f)
                arcToRelative(0.347f, 0.347f, 0.0f, false, true, 0.0f, -0.692f)
                arcToRelative(0.346f, 0.346f, 0.0f, false, true, 0.0f, 0.692f)
                close()
                moveTo(7.148f, 16.12f)
                curveToRelative(0.0f, 0.646f, 0.525f, 1.171f, 1.174f, 1.171f)
                horizontalLineToRelative(0.586f)
                verticalLineToRelative(2.401f)
                arcToRelative(1.279f, 1.279f, 0.0f, false, false, 2.558f, 0.0f)
                verticalLineToRelative(-2.401f)
                horizontalLineToRelative(1.066f)
                verticalLineToRelative(2.401f)
                curveToRelative(0.0f, 0.707f, 0.572f, 1.278f, 1.277f, 1.278f)
                curveToRelative(0.709f, 0.0f, 1.281f, -0.571f, 1.281f, -1.278f)
                verticalLineToRelative(-2.401f)
                horizontalLineToRelative(0.586f)
                curveToRelative(0.648f, 0.0f, 1.174f, -0.524f, 1.174f, -1.171f)
                lineTo(16.85f, 9.028f)
                lineTo(7.148f, 9.028f)
                verticalLineToRelative(7.092f)
                close()
            }
        }
        .build()
        return _bxlAndroid!!
    }

private var _bxlAndroid: ImageVector? = null
