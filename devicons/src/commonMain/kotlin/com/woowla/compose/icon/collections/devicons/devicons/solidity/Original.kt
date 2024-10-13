package com.woowla.compose.icon.collections.devicons.devicons.solidity

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.SolidityGroup

public val SolidityGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.45f, strokeAlpha
                    = 0.45f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(84.47f, 0.0f)
                lineTo(63.89f, 36.58f)
                horizontalLineTo(22.76f)
                lineTo(43.32f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                    = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(63.89f, 36.58f)
                horizontalLineToRelative(41.15f)
                lineTo(84.47f, 0.0f)
                horizontalLineTo(43.32f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.8f, strokeAlpha
                    = 0.8f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(43.32f, 73.14f)
                lineToRelative(20.57f, -36.56f)
                lineTo(43.32f, 0.0f)
                lineTo(22.76f, 36.58f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.45f, strokeAlpha
                    = 0.45f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(43.52f, 128.0f)
                lineTo(64.1f, 91.42f)
                horizontalLineToRelative(41.15f)
                lineTo(84.67f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                    = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.1f, 91.43f)
                horizontalLineTo(22.95f)
                lineToRelative(20.56f, 36.58f)
                horizontalLineToRelative(41.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.8f, strokeAlpha
                    = 0.8f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(84.67f, 54.86f)
                lineTo(64.1f, 91.43f)
                lineToRelative(20.56f, 36.58f)
                lineToRelative(20.58f, -36.58f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
