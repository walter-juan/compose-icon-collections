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

public val OutlineGroup.DocumentDuplicate: ImageVector
    get() {
        if (_documentDuplicate != null) {
            return _documentDuplicate!!
        }
        _documentDuplicate = Builder(name = "DocumentDuplicate", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.75f, 17.25f)
                verticalLineTo(20.625f)
                curveTo(15.75f, 21.246f, 15.246f, 21.75f, 14.625f, 21.75f)
                horizontalLineTo(4.875f)
                curveTo(4.254f, 21.75f, 3.75f, 21.246f, 3.75f, 20.625f)
                verticalLineTo(7.875f)
                curveTo(3.75f, 7.254f, 4.254f, 6.75f, 4.875f, 6.75f)
                horizontalLineTo(6.75f)
                curveTo(7.261f, 6.75f, 7.762f, 6.793f, 8.25f, 6.874f)
                moveTo(15.75f, 17.25f)
                horizontalLineTo(19.125f)
                curveTo(19.746f, 17.25f, 20.25f, 16.746f, 20.25f, 16.125f)
                verticalLineTo(11.25f)
                curveTo(20.25f, 6.791f, 17.007f, 3.089f, 12.75f, 2.374f)
                curveTo(12.262f, 2.293f, 11.761f, 2.25f, 11.25f, 2.25f)
                horizontalLineTo(9.375f)
                curveTo(8.754f, 2.25f, 8.25f, 2.754f, 8.25f, 3.375f)
                verticalLineTo(6.874f)
                moveTo(15.75f, 17.25f)
                horizontalLineTo(9.375f)
                curveTo(8.754f, 17.25f, 8.25f, 16.746f, 8.25f, 16.125f)
                verticalLineTo(6.874f)
                moveTo(20.25f, 13.5f)
                verticalLineTo(11.625f)
                curveTo(20.25f, 9.761f, 18.739f, 8.25f, 16.875f, 8.25f)
                horizontalLineTo(15.375f)
                curveTo(14.754f, 8.25f, 14.25f, 7.746f, 14.25f, 7.125f)
                verticalLineTo(5.625f)
                curveTo(14.25f, 3.761f, 12.739f, 2.25f, 10.875f, 2.25f)
                horizontalLineTo(9.75f)
            }
        }
        .build()
        return _documentDuplicate!!
    }

private var _documentDuplicate: ImageVector? = null
