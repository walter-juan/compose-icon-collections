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

public val OutlineGroup.Mail: ImageVector
    get() {
        if (_mail != null) {
            return _mail!!
        }
        _mail = Builder(name = "Mail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(88.0f, 96.0f)
                lineTo(424.0f, 96.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 464.0f, 136.0f)
                lineTo(464.0f, 376.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 424.0f, 416.0f)
                lineTo(88.0f, 416.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 48.0f, 376.0f)
                lineTo(48.0f, 136.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 88.0f, 96.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.0f, 160.0f)
                lineToRelative(144.0f, 112.0f)
                lineToRelative(144.0f, -112.0f)
            }
        }
        .build()
        return _mail!!
    }

private var _mail: ImageVector? = null
