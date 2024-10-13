package com.woowla.compose.icon.collections.devicons.devicons.logstash

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
import com.woowla.compose.icon.collections.devicons.devicons.LogstashGroup

public val LogstashGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF00bfb3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 128.0f)
                horizontalLineToRelative(44.0f)
                lineTo(116.0f, 80.0f)
                lineTo(72.0f, 80.0f)
                close()
                moveTo(72.0f, 128.0f)
            }
            path(fill = SolidColor(Color(0xFFfec514)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(52.0f)
                verticalLineTo(48.0f)
                curveTo(60.0f, 21.49f, 38.51f, 0.0f, 12.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF343741)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 80.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(4.0f)
                lineTo(60.0f, 80.0f)
                close()
                moveTo(8.0f, 80.0f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
