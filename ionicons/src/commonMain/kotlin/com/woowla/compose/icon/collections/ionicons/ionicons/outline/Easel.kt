package com.woowla.compose.icon.collections.ionicons.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.OutlineGroup

public val OutlineGroup.Easel: ImageVector
    get() {
        if (_easel != null) {
            return _easel!!
        }
        _easel = Builder(name = "Easel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(80.0f, 80.0f)
                lineTo(432.0f, 80.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 464.0f, 112.0f)
                lineTo(464.0f, 320.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 432.0f, 352.0f)
                lineTo(80.0f, 352.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 48.0f, 320.0f)
                lineTo(48.0f, 112.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 80.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 416.0f)
                lineTo(256.0f, 352.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 80.0f)
                lineTo(256.0f, 48.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(400.0f, 464.0f)
                lineTo(368.0f, 352.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.0f, 464.0f)
                lineTo(144.0f, 352.0f)
            }
        }
        .build()
        return _easel!!
    }

private var _easel: ImageVector? = null
