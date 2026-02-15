package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Forgejo: ImageVector
    get() {
        if (_forgejo != null) {
            return _forgejo!!
        }
        _forgejo = Builder(name = "Forgejo", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(261.5f, 1.2f)
                curveToRelative(34.0f, 0.0f, 61.6f, 27.6f, 61.6f, 61.6f)
                reflectiveCurveToRelative(-27.6f, 61.6f, -61.6f, 61.6f)
                curveToRelative(-23.0f, 0.0f, -43.1f, -12.7f, -53.7f, -31.4f)
                lineToRelative(-28.5f, 0.0f)
                curveToRelative(-24.0f, 0.0f, -47.0f, 9.5f, -64.0f, 26.5f)
                reflectiveCurveToRelative(-26.5f, 40.0f, -26.5f, 64.0f)
                lineToRelative(0.0f, 43.5f)
                curveToRelative(26.0f, -19.5f, 57.7f, -30.2f, 90.6f, -30.2f)
                lineToRelative(28.5f, 0.0f)
                curveToRelative(10.6f, -18.7f, 30.6f, -31.4f, 53.7f, -31.4f)
                curveToRelative(34.0f, 0.0f, 61.6f, 27.6f, 61.6f, 61.6f)
                reflectiveCurveToRelative(-27.6f, 61.6f, -61.6f, 61.6f)
                curveToRelative(-23.0f, 0.0f, -43.1f, -12.7f, -53.7f, -31.4f)
                lineToRelative(-28.5f, 0.0f)
                curveToRelative(-24.0f, 0.0f, -47.0f, 9.5f, -64.0f, 26.5f)
                reflectiveCurveToRelative(-26.5f, 40.0f, -26.5f, 64.0f)
                lineToRelative(0.0f, 47.8f)
                curveToRelative(18.7f, 10.6f, 31.4f, 30.6f, 31.4f, 53.6f)
                curveToRelative(0.0f, 34.0f, -27.6f, 61.6f, -61.6f, 61.6f)
                reflectiveCurveTo(-3.0f, 483.2f, -3.0f, 449.2f)
                curveToRelative(0.0f, -23.0f, 12.7f, -43.1f, 31.4f, -53.6f)
                lineToRelative(0.0f, -212.0f)
                curveToRelative(0.0f, -40.0f, 15.9f, -78.4f, 44.2f, -106.7f)
                reflectiveCurveToRelative(66.7f, -44.2f, 106.7f, -44.2f)
                lineToRelative(28.5f, 0.0f)
                curveToRelative(10.6f, -18.7f, 30.6f, -31.4f, 53.7f, -31.4f)
                close()
                moveTo(58.6f, 423.9f)
                curveToRelative(-14.0f, 0.0f, -25.3f, 11.3f, -25.3f, 25.3f)
                reflectiveCurveToRelative(11.3f, 25.4f, 25.3f, 25.4f)
                reflectiveCurveToRelative(25.4f, -11.4f, 25.4f, -25.4f)
                reflectiveCurveToRelative(-11.4f, -25.3f, -25.4f, -25.3f)
                close()
                moveTo(261.5f, 201.7f)
                arcToRelative(25.4f, 25.4f, 0.0f, true, false, 0.0f, 50.7f)
                arcToRelative(25.4f, 25.4f, 0.0f, true, false, 0.0f, -50.7f)
                close()
                moveTo(261.5f, 37.5f)
                arcToRelative(25.4f, 25.4f, 0.0f, true, false, 0.0f, 50.7f)
                arcToRelative(25.4f, 25.4f, 0.0f, true, false, 0.0f, -50.7f)
                close()
            }
        }
        .build()
        return _forgejo!!
    }

private var _forgejo: ImageVector? = null
