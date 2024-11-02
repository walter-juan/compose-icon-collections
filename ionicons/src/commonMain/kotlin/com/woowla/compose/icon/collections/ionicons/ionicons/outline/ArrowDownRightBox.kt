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

public val OutlineGroup.ArrowDownRightBox: ImageVector
    get() {
        if (_arrowDownRightBox != null) {
            return _arrowDownRightBox!!
        }
        _arrowDownRightBox = Builder(name = "ArrowDownRightBox", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(269.24f, 388.36f)
                lineTo(90.55f, 388.36f)
                curveTo(79.26f, 388.36f, 68.44f, 383.88f, 60.46f, 375.9f)
                curveTo(52.48f, 367.92f, 48.0f, 357.1f, 48.0f, 345.82f)
                lineTo(48.0f, 90.55f)
                curveTo(48.0f, 79.26f, 52.48f, 68.44f, 60.46f, 60.46f)
                curveTo(68.44f, 52.48f, 79.26f, 48.0f, 90.55f, 48.0f)
                lineTo(345.82f, 48.0f)
                curveTo(357.1f, 48.0f, 367.92f, 52.48f, 375.9f, 60.46f)
                curveTo(383.88f, 68.44f, 388.36f, 79.26f, 388.36f, 90.55f)
                lineTo(388.36f, 269.24f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(331.64f, 464.0f)
                lineTo(464.0f, 464.0f)
                lineTo(464.0f, 331.64f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 216.0f)
                lineTo(464.0f, 464.0f)
            }
        }
        .build()
        return _arrowDownRightBox!!
    }

private var _arrowDownRightBox: ImageVector? = null
