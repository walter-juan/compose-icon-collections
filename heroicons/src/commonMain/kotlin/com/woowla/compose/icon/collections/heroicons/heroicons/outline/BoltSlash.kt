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

public val OutlineGroup.BoltSlash: ImageVector
    get() {
        if (_boltSlash != null) {
            return _boltSlash!!
        }
        _boltSlash = Builder(name = "BoltSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.412f, 15.655f)
                lineTo(9.75f, 21.75f)
                lineTo(13.495f, 17.738f)
                moveTo(9.257f, 13.5f)
                horizontalLineTo(3.75f)
                lineTo(6.409f, 10.651f)
                moveTo(8.457f, 8.457f)
                lineTo(14.25f, 2.25f)
                lineTo(12.0f, 10.5f)
                horizontalLineTo(20.25f)
                lineTo(15.543f, 15.543f)
                moveTo(8.457f, 8.457f)
                lineTo(3.0f, 3.0f)
                moveTo(8.457f, 8.457f)
                lineTo(15.543f, 15.543f)
                moveTo(15.543f, 15.543f)
                lineTo(21.0f, 21.0f)
            }
        }
        .build()
        return _boltSlash!!
    }

private var _boltSlash: ImageVector? = null
