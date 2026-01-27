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

public val HealthAndMedicalGroup.Brain4Fill: ImageVector
    get() {
        if (_brain4Fill != null) {
            return _brain4Fill!!
        }
        _brain4Fill = Builder(name = "Brain4Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 4.783f)
                verticalLineTo(7.671f)
                lineTo(22.0f, 9.114f)
                verticalLineTo(14.887f)
                lineTo(19.499f, 16.331f)
                lineTo(19.5f, 19.218f)
                lineTo(14.5f, 22.104f)
                lineTo(13.0f, 21.238f)
                verticalLineTo(14.923f)
                lineTo(9.036f, 12.634f)
                lineTo(8.036f, 14.366f)
                lineTo(11.0f, 16.077f)
                verticalLineTo(21.237f)
                lineTo(9.5f, 22.104f)
                lineTo(4.5f, 19.218f)
                verticalLineTo(16.331f)
                lineTo(2.0f, 14.888f)
                lineTo(2.001f, 9.113f)
                lineTo(4.5f, 7.67f)
                verticalLineTo(4.784f)
                lineTo(9.5f, 1.897f)
                lineTo(11.0f, 2.764f)
                verticalLineTo(9.077f)
                lineTo(14.965f, 11.366f)
                lineTo(15.965f, 9.634f)
                lineTo(12.999f, 7.922f)
                verticalLineTo(2.763f)
                lineTo(14.501f, 1.896f)
                lineTo(19.5f, 4.783f)
                close()
            }
        }
        .build()
        return _brain4Fill!!
    }

private var _brain4Fill: ImageVector? = null
