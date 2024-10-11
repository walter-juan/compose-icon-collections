package com.woowla.compose.icon.collections.remix.remix.healthandmedical

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.HealthAndMedicalGroup

public val HealthAndMedicalGroup.LungsFill: ImageVector
    get() {
        if (_lungsFill != null) {
            return _lungsFill!!
        }
        _lungsFill = Builder(name = "LungsFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 5.5f)
                curveTo(9.912f, 5.971f, 10.548f, 7.659f, 10.827f, 9.523f)
                lineTo(6.304f, 12.134f)
                lineTo(7.304f, 13.866f)
                lineTo(11.014f, 11.725f)
                curveTo(11.06f, 13.079f, 11.0f, 14.309f, 11.0f, 15.0f)
                curveTo(11.0f, 18.0f, 10.0f, 21.0f, 6.0f, 21.0f)
                curveTo(2.0f, 21.0f, 2.0f, 21.0f, 2.0f, 17.0f)
                curveTo(2.0f, 9.5f, 5.501f, 4.5f, 8.5f, 5.5f)
                close()
                moveTo(22.001f, 17.0f)
                lineTo(22.001f, 17.436f)
                curveTo(21.996f, 21.0f, 21.85f, 21.0f, 18.001f, 21.0f)
                curveTo(14.001f, 21.0f, 13.001f, 18.0f, 13.001f, 15.0f)
                curveTo(13.001f, 14.309f, 12.941f, 13.08f, 12.987f, 11.726f)
                lineTo(16.696f, 13.866f)
                lineTo(17.696f, 12.134f)
                lineTo(13.174f, 9.524f)
                curveTo(13.453f, 7.659f, 14.089f, 5.971f, 15.501f, 5.5f)
                curveTo(18.501f, 4.5f, 22.001f, 9.5f, 22.001f, 17.0f)
                close()
                moveTo(13.0f, 2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _lungsFill!!
    }

private var _lungsFill: ImageVector? = null
