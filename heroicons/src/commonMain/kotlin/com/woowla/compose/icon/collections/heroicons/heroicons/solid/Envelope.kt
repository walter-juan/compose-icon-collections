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

public val SolidGroup.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 8.669f)
                verticalLineTo(17.25f)
                curveTo(1.5f, 18.907f, 2.843f, 20.25f, 4.5f, 20.25f)
                horizontalLineTo(19.5f)
                curveTo(21.157f, 20.25f, 22.5f, 18.907f, 22.5f, 17.25f)
                verticalLineTo(8.669f)
                lineTo(13.572f, 14.163f)
                curveTo(12.608f, 14.756f, 11.392f, 14.756f, 10.428f, 14.163f)
                lineTo(1.5f, 8.669f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 6.908f)
                verticalLineTo(6.75f)
                curveTo(22.5f, 5.093f, 21.157f, 3.75f, 19.5f, 3.75f)
                horizontalLineTo(4.5f)
                curveTo(2.843f, 3.75f, 1.5f, 5.093f, 1.5f, 6.75f)
                verticalLineTo(6.908f)
                lineTo(11.214f, 12.886f)
                curveTo(11.696f, 13.182f, 12.304f, 13.182f, 12.786f, 12.886f)
                lineTo(22.5f, 6.908f)
                close()
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
