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

public val OutlineGroup.Underline: ImageVector
    get() {
        if (_underline != null) {
            return _underline!!
        }
        _underline = Builder(name = "Underline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.995f, 3.744f)
                verticalLineTo(11.245f)
                curveTo(17.995f, 14.559f, 15.309f, 17.245f, 11.995f, 17.245f)
                curveTo(8.682f, 17.245f, 5.996f, 14.559f, 5.996f, 11.245f)
                verticalLineTo(3.744f)
                moveTo(3.746f, 20.246f)
                horizontalLineTo(20.245f)
            }
        }
        .build()
        return _underline!!
    }

private var _underline: ImageVector? = null
