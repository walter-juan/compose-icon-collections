package com.woowla.compose.icon.collections.ionicons.ionicons.outline

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
import com.woowla.compose.icon.collections.ionicons.ionicons.OutlineGroup

public val OutlineGroup.ArrowDownLeftBox: ImageVector
    get() {
        if (_arrowDownLeftBox != null) {
            return _arrowDownLeftBox!!
        }
        _arrowDownLeftBox = Builder(name = "ArrowDownLeftBox", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(123.64f, 269.24f)
                lineTo(123.64f, 90.55f)
                curveTo(123.64f, 79.26f, 128.12f, 68.44f, 136.1f, 60.46f)
                curveTo(144.08f, 52.48f, 154.9f, 48.0f, 166.18f, 48.0f)
                lineTo(421.45f, 48.0f)
                curveTo(432.74f, 48.0f, 443.56f, 52.48f, 451.54f, 60.46f)
                curveTo(459.52f, 68.44f, 464.0f, 79.26f, 464.0f, 90.55f)
                lineTo(464.0f, 345.82f)
                curveTo(464.0f, 357.1f, 459.52f, 367.92f, 451.54f, 375.9f)
                curveTo(443.56f, 383.88f, 432.74f, 388.36f, 421.45f, 388.36f)
                lineTo(242.76f, 388.36f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 331.64f)
                lineTo(48.0f, 464.0f)
                lineTo(180.36f, 464.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(296.0f, 216.0f)
                lineTo(48.0f, 464.0f)
            }
        }
        .build()
        return _arrowDownLeftBox!!
    }

private var _arrowDownLeftBox: ImageVector? = null
