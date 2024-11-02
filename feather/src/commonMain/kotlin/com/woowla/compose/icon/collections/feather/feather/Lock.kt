package com.woowla.compose.icon.collections.feather.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.feather.Feather

public val Feather.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 11.0f)
                lineTo(19.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 13.0f)
                lineTo(21.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 20.0f)
                lineTo(3.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 11.0f)
                verticalLineTo(7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 10.0f, 0.0f)
                verticalLineToRelative(4.0f)
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
