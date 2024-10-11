package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.SkipBackFill: ImageVector
    get() {
        if (_skipBackFill != null) {
            return _skipBackFill!!
        }
        _skipBackFill = Builder(name = "SkipBackFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.333f)
                lineTo(18.223f, 4.518f)
                curveTo(18.452f, 4.365f, 18.763f, 4.427f, 18.916f, 4.657f)
                curveTo(18.971f, 4.739f, 19.0f, 4.836f, 19.0f, 4.934f)
                verticalLineTo(19.066f)
                curveTo(19.0f, 19.342f, 18.776f, 19.566f, 18.5f, 19.566f)
                curveTo(18.401f, 19.566f, 18.305f, 19.537f, 18.223f, 19.482f)
                lineTo(8.0f, 12.667f)
                verticalLineTo(19.0f)
                curveTo(8.0f, 19.552f, 7.552f, 20.0f, 7.0f, 20.0f)
                curveTo(6.448f, 20.0f, 6.0f, 19.552f, 6.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(6.0f, 4.448f, 6.448f, 4.0f, 7.0f, 4.0f)
                curveTo(7.552f, 4.0f, 8.0f, 4.448f, 8.0f, 5.0f)
                verticalLineTo(11.333f)
                close()
            }
        }
        .build()
        return _skipBackFill!!
    }

private var _skipBackFill: ImageVector? = null
