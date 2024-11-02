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

public val OutlineGroup.H3: ImageVector
    get() {
        if (_h3 != null) {
            return _h3!!
        }
        _h3 = Builder(name = "H3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.906f, 14.626f)
                curveTo(21.437f, 15.365f, 21.75f, 16.271f, 21.75f, 17.251f)
                curveTo(21.75f, 17.587f, 21.713f, 17.914f, 21.643f, 18.229f)
                curveTo(21.489f, 18.924f, 20.849f, 19.372f, 20.139f, 19.437f)
                curveTo(19.682f, 19.479f, 19.218f, 19.501f, 18.75f, 19.501f)
                curveTo(17.985f, 19.501f, 17.234f, 19.444f, 16.5f, 19.333f)
                moveTo(20.906f, 14.626f)
                curveTo(21.437f, 13.887f, 21.75f, 12.98f, 21.75f, 12.001f)
                curveTo(21.75f, 11.665f, 21.713f, 11.338f, 21.643f, 11.023f)
                curveTo(21.489f, 10.327f, 20.849f, 9.879f, 20.139f, 9.814f)
                curveTo(19.682f, 9.772f, 19.218f, 9.751f, 18.75f, 9.751f)
                curveTo(17.985f, 9.751f, 17.234f, 9.808f, 16.5f, 9.918f)
                moveTo(20.906f, 14.626f)
                horizontalLineTo(18.0f)
                moveTo(2.243f, 4.493f)
                verticalLineTo(11.994f)
                moveTo(2.243f, 11.994f)
                verticalLineTo(19.495f)
                moveTo(2.243f, 11.994f)
                lineTo(12.743f, 11.995f)
                moveTo(12.743f, 4.494f)
                verticalLineTo(11.995f)
                moveTo(12.743f, 11.995f)
                verticalLineTo(19.495f)
            }
        }
        .build()
        return _h3!!
    }

private var _h3: ImageVector? = null
