package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Plus: ImageVector
    get() {
        if (_plus != null) {
            return _plus!!
        }
        _plus = Builder(name = "Plus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.75f)
                curveTo(12.414f, 3.75f, 12.75f, 4.086f, 12.75f, 4.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(19.5f)
                curveTo(19.914f, 11.25f, 20.25f, 11.586f, 20.25f, 12.0f)
                curveTo(20.25f, 12.414f, 19.914f, 12.75f, 19.5f, 12.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(19.5f)
                curveTo(12.75f, 19.914f, 12.414f, 20.25f, 12.0f, 20.25f)
                curveTo(11.586f, 20.25f, 11.25f, 19.914f, 11.25f, 19.5f)
                verticalLineTo(12.75f)
                horizontalLineTo(4.5f)
                curveTo(4.086f, 12.75f, 3.75f, 12.414f, 3.75f, 12.0f)
                curveTo(3.75f, 11.586f, 4.086f, 11.25f, 4.5f, 11.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(4.5f)
                curveTo(11.25f, 4.086f, 11.586f, 3.75f, 12.0f, 3.75f)
                close()
            }
        }
        .build()
        return _plus!!
    }

private var _plus: ImageVector? = null
