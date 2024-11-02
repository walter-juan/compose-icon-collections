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

public val OutlineGroup.ArrowUpRightBox: ImageVector
    get() {
        if (_arrowUpRightBox != null) {
            return _arrowUpRightBox!!
        }
        _arrowUpRightBox = Builder(name = "ArrowUpRightBox", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(388.36f, 242.76f)
                verticalLineTo(421.45f)
                curveTo(388.36f, 432.74f, 383.88f, 443.56f, 375.9f, 451.54f)
                curveTo(367.92f, 459.52f, 357.1f, 464.0f, 345.82f, 464.0f)
                horizontalLineTo(90.55f)
                curveTo(79.26f, 464.0f, 68.44f, 459.52f, 60.46f, 451.54f)
                curveTo(52.48f, 443.56f, 48.0f, 432.74f, 48.0f, 421.45f)
                verticalLineTo(166.18f)
                curveTo(48.0f, 154.9f, 52.48f, 144.08f, 60.46f, 136.1f)
                curveTo(68.44f, 128.12f, 79.26f, 123.64f, 90.55f, 123.64f)
                horizontalLineTo(269.24f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(464.0f, 180.36f)
                lineTo(464.0f, 48.0f)
                lineTo(331.64f, 48.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 296.0f)
                lineTo(464.0f, 48.0f)
            }
        }
        .build()
        return _arrowUpRightBox!!
    }

private var _arrowUpRightBox: ImageVector? = null
