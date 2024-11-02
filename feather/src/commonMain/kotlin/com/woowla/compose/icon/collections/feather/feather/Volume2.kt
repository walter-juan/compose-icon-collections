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

public val Feather.Volume2: ImageVector
    get() {
        if (_volume2 != null) {
            return _volume2!!
        }
        _volume2 = Builder(name = "Volume2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                lineToRelative(-5.0f, 4.0f)
                lineToRelative(-4.0f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(5.0f, 4.0f)
                lineToRelative(0.0f, -14.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.07f, 4.93f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 14.14f)
                moveTo(15.54f, 8.46f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 7.07f)
            }
        }
        .build()
        return _volume2!!
    }

private var _volume2: ImageVector? = null
