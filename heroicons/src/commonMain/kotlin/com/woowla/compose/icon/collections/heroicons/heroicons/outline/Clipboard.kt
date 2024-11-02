package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Clipboard: ImageVector
    get() {
        if (_clipboard != null) {
            return _clipboard!!
        }
        _clipboard = Builder(name = "Clipboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.666f, 3.888f)
                curveTo(15.399f, 2.943f, 14.531f, 2.25f, 13.5f, 2.25f)
                horizontalLineTo(10.5f)
                curveTo(9.47f, 2.25f, 8.601f, 2.943f, 8.334f, 3.888f)
                moveTo(15.666f, 3.888f)
                curveTo(15.721f, 4.082f, 15.75f, 4.288f, 15.75f, 4.5f)
                verticalLineTo(4.5f)
                curveTo(15.75f, 4.914f, 15.414f, 5.25f, 15.0f, 5.25f)
                horizontalLineTo(9.0f)
                curveTo(8.586f, 5.25f, 8.25f, 4.914f, 8.25f, 4.5f)
                verticalLineTo(4.5f)
                curveTo(8.25f, 4.288f, 8.279f, 4.082f, 8.334f, 3.888f)
                moveTo(15.666f, 3.888f)
                curveTo(16.312f, 3.937f, 16.955f, 3.998f, 17.593f, 4.072f)
                curveTo(18.694f, 4.2f, 19.5f, 5.149f, 19.5f, 6.257f)
                verticalLineTo(19.5f)
                curveTo(19.5f, 20.743f, 18.493f, 21.75f, 17.25f, 21.75f)
                horizontalLineTo(6.75f)
                curveTo(5.507f, 21.75f, 4.5f, 20.743f, 4.5f, 19.5f)
                verticalLineTo(6.257f)
                curveTo(4.5f, 5.149f, 5.306f, 4.2f, 6.407f, 4.072f)
                curveTo(7.045f, 3.998f, 7.688f, 3.937f, 8.334f, 3.888f)
            }
        }
        .build()
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
