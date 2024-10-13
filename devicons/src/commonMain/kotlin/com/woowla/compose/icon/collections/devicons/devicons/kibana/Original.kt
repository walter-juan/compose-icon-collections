package com.woowla.compose.icon.collections.devicons.devicons.kibana

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
import com.woowla.compose.icon.collections.devicons.devicons.KibanaGroup

public val KibanaGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFf04e98)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 0.0f)
                lineTo(12.0f, 0.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(17.3f, 0.0f, 33.54f, 4.45f, 47.73f, 12.19f)
                close()
                moveTo(112.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF343741)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 48.0f)
                verticalLineToRelative(67.15f)
                lineToRelative(47.73f, -54.96f)
                arcTo(99.42f, 99.42f, 0.0f, false, false, 12.0f, 48.0f)
            }
            path(fill = SolidColor(Color(0xFF00bfb3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(70.04f, 66.62f)
                lineToRelative(-48.97f, 56.41f)
                lineTo(16.74f, 128.0f)
                horizontalLineToRelative(93.26f)
                curveToRelative(-5.12f, -25.21f, -19.76f, -46.94f, -39.96f, -61.38f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
