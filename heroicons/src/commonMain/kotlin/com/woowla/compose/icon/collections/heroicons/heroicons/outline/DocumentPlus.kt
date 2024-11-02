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

public val OutlineGroup.DocumentPlus: ImageVector
    get() {
        if (_documentPlus != null) {
            return _documentPlus!!
        }
        _documentPlus = Builder(name = "DocumentPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 14.25f)
                verticalLineTo(11.625f)
                curveTo(19.5f, 9.761f, 17.989f, 8.25f, 16.125f, 8.25f)
                horizontalLineTo(14.625f)
                curveTo(14.004f, 8.25f, 13.5f, 7.746f, 13.5f, 7.125f)
                verticalLineTo(5.625f)
                curveTo(13.5f, 3.761f, 11.989f, 2.25f, 10.125f, 2.25f)
                horizontalLineTo(8.25f)
                moveTo(12.0f, 11.25f)
                verticalLineTo(17.25f)
                moveTo(15.0f, 14.25f)
                horizontalLineTo(9.0f)
                moveTo(10.5f, 2.25f)
                horizontalLineTo(5.625f)
                curveTo(5.004f, 2.25f, 4.5f, 2.754f, 4.5f, 3.375f)
                verticalLineTo(20.625f)
                curveTo(4.5f, 21.246f, 5.004f, 21.75f, 5.625f, 21.75f)
                horizontalLineTo(18.375f)
                curveTo(18.996f, 21.75f, 19.5f, 21.246f, 19.5f, 20.625f)
                verticalLineTo(11.25f)
                curveTo(19.5f, 6.279f, 15.471f, 2.25f, 10.5f, 2.25f)
                close()
            }
        }
        .build()
        return _documentPlus!!
    }

private var _documentPlus: ImageVector? = null
