package com.woowla.compose.icon.collections.heroicons.heroicons.solid

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
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.731f, 2.269f)
                curveTo(20.706f, 1.244f, 19.044f, 1.244f, 18.019f, 2.269f)
                lineTo(16.862f, 3.426f)
                lineTo(20.574f, 7.138f)
                lineTo(21.731f, 5.981f)
                curveTo(22.756f, 4.956f, 22.756f, 3.294f, 21.731f, 2.269f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.513f, 8.199f)
                lineTo(15.801f, 4.487f)
                lineTo(3.65f, 16.638f)
                curveTo(3.033f, 17.254f, 2.58f, 18.015f, 2.331f, 18.851f)
                lineTo(1.531f, 21.536f)
                curveTo(1.453f, 21.8f, 1.525f, 22.086f, 1.72f, 22.28f)
                curveTo(1.914f, 22.475f, 2.2f, 22.547f, 2.464f, 22.469f)
                lineTo(5.149f, 21.669f)
                curveTo(5.985f, 21.42f, 6.746f, 20.967f, 7.363f, 20.35f)
                lineTo(19.513f, 8.199f)
                close()
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
