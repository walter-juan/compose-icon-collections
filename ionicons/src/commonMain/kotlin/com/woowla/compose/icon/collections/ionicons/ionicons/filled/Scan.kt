package com.woowla.compose.icon.collections.ionicons.ionicons.filled

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
import com.woowla.compose.icon.collections.ionicons.ionicons.FilledGroup

public val FilledGroup.Scan: ImageVector
    get() {
        if (_scan != null) {
            return _scan!!
        }
        _scan = Builder(name = "Scan", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 44.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(342.0f, 444.0f)
                horizontalLineToRelative(46.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 56.0f, -56.0f)
                verticalLineTo(342.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 44.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(444.0f, 170.0f)
                verticalLineTo(124.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -56.0f, -56.0f)
                horizontalLineTo(342.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 44.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(170.0f, 444.0f)
                horizontalLineTo(124.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -56.0f, -56.0f)
                verticalLineTo(342.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 44.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(68.0f, 170.0f)
                verticalLineTo(124.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 56.0f, -56.0f)
                horizontalLineToRelative(46.0f)
            }
        }
        .build()
        return _scan!!
    }

private var _scan: ImageVector? = null
