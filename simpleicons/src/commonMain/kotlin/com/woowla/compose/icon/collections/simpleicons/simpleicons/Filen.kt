package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Filen: ImageVector
    get() {
        if (_filen != null) {
            return _filen!!
        }
        _filen = Builder(name = "Filen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.387f, 0.0f, 0.0f, 5.387f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.387f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.387f, 12.0f, -12.0f)
                reflectiveCurveTo(18.613f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 1.531f)
                arcToRelative(10.47f, 10.47f, 0.0f, false, true, 6.384f, 2.196f)
                verticalLineToRelative(3.92f)
                lineTo(8.052f, 7.647f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -0.749f, 0.748f)
                verticalLineToRelative(2.373f)
                curveToRelative(-0.425f, 0.26f, -0.69f, 0.719f, -0.7f, 1.217f)
                arcTo(1.464f, 1.464f, 0.0f, true, false, 8.83f, 10.74f)
                lineTo(8.83f, 9.172f)
                horizontalLineToRelative(10.332f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 0.748f, -0.75f)
                lineTo(19.91f, 5.193f)
                arcTo(10.47f, 10.47f, 0.0f, false, true, 22.47f, 12.0f)
                lineToRelative(-0.012f, 0.151f)
                horizontalLineToRelative(-3.324f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -0.749f, 0.749f)
                verticalLineToRelative(7.372f)
                arcToRelative(10.47f, 10.47f, 0.0f, false, true, -1.963f, 1.193f)
                lineTo(16.422f, 14.12f)
                curveToRelative(0.425f, -0.26f, 0.69f, -0.718f, 0.7f, -1.217f)
                arcToRelative(1.464f, 1.464f, 0.0f, false, false, -2.927f, 0.0f)
                curveToRelative(0.01f, 0.499f, 0.275f, 0.957f, 0.7f, 1.217f)
                verticalLineToRelative(7.92f)
                arcToRelative(10.47f, 10.47f, 0.0f, false, true, -2.894f, 0.43f)
                arcToRelative(10.463f, 10.463f, 0.0f, false, true, -3.19f, -0.502f)
                verticalLineToRelative(-6.024f)
                horizontalLineToRelative(1.83f)
                curveToRelative(0.259f, 0.426f, 0.718f, 0.69f, 1.216f, 0.7f)
                arcToRelative(1.464f, 1.464f, 0.0f, false, false, 0.0f, -2.927f)
                arcToRelative(1.464f, 1.464f, 0.0f, false, false, -1.217f, 0.7f)
                lineTo(8.033f, 14.417f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -0.749f, 0.75f)
                verticalLineToRelative(6.177f)
                arcTo(10.471f, 10.471f, 0.0f, false, true, 4.8f, 19.576f)
                lineTo(4.8f, 5.252f)
                horizontalLineToRelative(8.314f)
                curveToRelative(0.26f, 0.425f, 0.718f, 0.69f, 1.216f, 0.7f)
                arcToRelative(1.464f, 1.464f, 0.0f, false, false, 0.0f, -2.928f)
                arcToRelative(1.464f, 1.464f, 0.0f, false, false, -1.216f, 0.701f)
                lineTo(5.619f, 3.725f)
                arcTo(10.47f, 10.47f, 0.0f, false, true, 12.0f, 1.532f)
                close()
                moveTo(3.274f, 6.266f)
                verticalLineToRelative(11.468f)
                arcTo(10.469f, 10.469f, 0.0f, false, true, 1.53f, 12.0f)
                curveToRelative(0.01f, -2.04f, 0.615f, -4.033f, 1.743f, -5.734f)
                close()
                moveTo(19.911f, 13.678f)
                horizontalLineToRelative(2.42f)
                arcToRelative(10.47f, 10.47f, 0.0f, false, true, -2.42f, 5.13f)
                close()
            }
        }
        .build()
        return _filen!!
    }

private var _filen: ImageVector? = null
