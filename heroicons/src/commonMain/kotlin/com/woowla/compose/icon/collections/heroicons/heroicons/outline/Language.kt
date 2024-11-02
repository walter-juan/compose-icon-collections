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

public val OutlineGroup.Language: ImageVector
    get() {
        if (_language != null) {
            return _language!!
        }
        _language = Builder(name = "Language", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 21.0f)
                lineTo(15.75f, 9.75f)
                lineTo(21.0f, 21.0f)
                moveTo(12.0f, 18.0f)
                horizontalLineTo(19.5f)
                moveTo(3.0f, 5.621f)
                curveTo(4.966f, 5.376f, 6.968f, 5.25f, 9.0f, 5.25f)
                moveTo(9.0f, 5.25f)
                curveTo(10.121f, 5.25f, 11.233f, 5.288f, 12.334f, 5.364f)
                moveTo(9.0f, 5.25f)
                verticalLineTo(3.0f)
                moveTo(12.334f, 5.364f)
                curveTo(11.176f, 10.658f, 7.689f, 15.08f, 3.0f, 17.502f)
                moveTo(12.334f, 5.364f)
                curveTo(13.23f, 5.425f, 14.119f, 5.511f, 15.0f, 5.621f)
                moveTo(10.411f, 14.116f)
                curveTo(8.786f, 12.462f, 7.477f, 10.495f, 6.584f, 8.314f)
            }
        }
        .build()
        return _language!!
    }

private var _language: ImageVector? = null
