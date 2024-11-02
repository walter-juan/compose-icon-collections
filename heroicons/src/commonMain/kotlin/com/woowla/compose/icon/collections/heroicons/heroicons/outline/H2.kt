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

public val OutlineGroup.H2: ImageVector
    get() {
        if (_h2 != null) {
            return _h2!!
        }
        _h2 = Builder(name = "H2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.75f, 19.501f)
                horizontalLineTo(16.5f)
                verticalLineTo(17.891f)
                curveTo(16.5f, 17.039f, 16.982f, 16.26f, 17.744f, 15.879f)
                lineTo(20.633f, 14.434f)
                curveTo(21.285f, 14.108f, 21.75f, 13.479f, 21.75f, 12.751f)
                curveTo(21.75f, 12.252f, 21.71f, 11.764f, 21.632f, 11.288f)
                curveTo(21.497f, 10.463f, 20.797f, 9.866f, 19.964f, 9.799f)
                curveTo(19.564f, 9.767f, 19.159f, 9.751f, 18.75f, 9.751f)
                curveTo(17.985f, 9.751f, 17.234f, 9.808f, 16.5f, 9.918f)
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
        return _h2!!
    }

private var _h2: ImageVector? = null
