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

public val OutlineGroup.ArrowUpLeftBox: ImageVector
    get() {
        if (_arrowUpLeftBox != null) {
            return _arrowUpLeftBox!!
        }
        _arrowUpLeftBox = Builder(name = "ArrowUpLeftBox", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(242.76f, 123.64f)
                lineTo(421.45f, 123.64f)
                curveTo(432.74f, 123.64f, 443.56f, 128.12f, 451.54f, 136.1f)
                curveTo(459.52f, 144.08f, 464.0f, 154.9f, 464.0f, 166.18f)
                lineTo(464.0f, 421.45f)
                curveTo(464.0f, 432.74f, 459.52f, 443.56f, 451.54f, 451.54f)
                curveTo(443.56f, 459.52f, 432.74f, 464.0f, 421.45f, 464.0f)
                lineTo(166.18f, 464.0f)
                curveTo(154.9f, 464.0f, 144.08f, 459.52f, 136.1f, 451.54f)
                curveTo(128.12f, 443.56f, 123.64f, 432.74f, 123.64f, 421.45f)
                lineTo(123.64f, 242.76f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(180.36f, 48.0f)
                lineTo(48.0f, 48.0f)
                lineTo(48.0f, 180.36f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(296.0f, 296.0f)
                lineTo(48.0f, 48.0f)
            }
        }
        .build()
        return _arrowUpLeftBox!!
    }

private var _arrowUpLeftBox: ImageVector? = null
