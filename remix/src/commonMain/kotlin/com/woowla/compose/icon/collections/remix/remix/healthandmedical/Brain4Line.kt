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

public val HealthAndMedicalGroup.Brain4Line: ImageVector
    get() {
        if (_brain4Line != null) {
            return _brain4Line!!
        }
        _brain4Line = Builder(name = "Brain4Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                lineTo(12.0f, 20.661f)
                lineTo(9.5f, 22.104f)
                lineTo(4.5f, 19.218f)
                verticalLineTo(16.331f)
                lineTo(2.0f, 14.888f)
                lineTo(2.001f, 9.113f)
                lineTo(4.5f, 7.67f)
                verticalLineTo(4.784f)
                lineTo(9.5f, 1.897f)
                lineTo(11.999f, 3.341f)
                lineTo(14.501f, 1.896f)
                lineTo(19.5f, 4.783f)
                close()
                moveTo(13.0f, 5.072f)
                lineTo(12.999f, 8.423f)
                lineTo(15.964f, 10.134f)
                lineTo(14.964f, 11.866f)
                lineTo(11.0f, 9.577f)
                verticalLineTo(5.073f)
                lineTo(9.5f, 4.207f)
                lineTo(6.499f, 5.938f)
                verticalLineTo(8.825f)
                lineTo(4.0f, 10.268f)
                verticalLineTo(13.733f)
                lineTo(6.5f, 15.177f)
                verticalLineTo(18.063f)
                lineTo(9.5f, 19.796f)
                lineTo(11.0f, 18.929f)
                lineTo(11.001f, 15.577f)
                lineTo(8.036f, 13.865f)
                lineTo(9.036f, 12.134f)
                lineTo(13.001f, 14.423f)
                verticalLineTo(18.93f)
                lineTo(14.5f, 19.796f)
                lineTo(17.5f, 18.063f)
                verticalLineTo(15.177f)
                lineTo(20.0f, 13.732f)
                verticalLineTo(10.269f)
                lineTo(17.499f, 8.825f)
                lineTo(17.5f, 5.938f)
                lineTo(14.501f, 4.206f)
                lineTo(13.0f, 5.072f)
                close()
            }
        }
        .build()
        return _brain4Line!!
    }

private var _brain4Line: ImageVector? = null
