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

public val HealthAndMedicalGroup.Brain3Fill: ImageVector
    get() {
        if (_brain3Fill != null) {
            return _brain3Fill!!
        }
        _brain3Fill = Builder(name = "Brain3Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
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
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.763f)
                lineTo(14.501f, 1.896f)
                lineTo(19.5f, 4.783f)
                close()
            }
        }
        .build()
        return _brain3Fill!!
    }

private var _brain3Fill: ImageVector? = null
