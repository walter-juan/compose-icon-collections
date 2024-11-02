package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.645f, 20.911f)
                lineTo(11.638f, 20.907f)
                lineTo(11.616f, 20.895f)
                curveTo(11.597f, 20.884f, 11.569f, 20.869f, 11.534f, 20.85f)
                curveTo(11.463f, 20.81f, 11.361f, 20.752f, 11.233f, 20.677f)
                curveTo(10.976f, 20.526f, 10.613f, 20.304f, 10.179f, 20.015f)
                curveTo(9.311f, 19.438f, 8.151f, 18.59f, 6.989f, 17.506f)
                curveTo(4.688f, 15.361f, 2.25f, 12.175f, 2.25f, 8.25f)
                curveTo(2.25f, 5.322f, 4.714f, 3.0f, 7.688f, 3.0f)
                curveTo(9.436f, 3.0f, 11.002f, 3.799f, 12.0f, 5.052f)
                curveTo(12.998f, 3.799f, 14.564f, 3.0f, 16.313f, 3.0f)
                curveTo(19.286f, 3.0f, 21.75f, 5.322f, 21.75f, 8.25f)
                curveTo(21.75f, 12.175f, 19.312f, 15.361f, 17.011f, 17.506f)
                curveTo(15.849f, 18.59f, 14.689f, 19.438f, 13.821f, 20.015f)
                curveTo(13.387f, 20.304f, 13.024f, 20.526f, 12.767f, 20.677f)
                curveTo(12.639f, 20.752f, 12.537f, 20.81f, 12.466f, 20.85f)
                curveTo(12.431f, 20.869f, 12.403f, 20.884f, 12.384f, 20.895f)
                lineTo(12.362f, 20.907f)
                lineTo(12.355f, 20.911f)
                lineTo(12.352f, 20.912f)
                curveTo(12.132f, 21.029f, 11.868f, 21.029f, 11.648f, 20.912f)
                lineTo(11.645f, 20.911f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
