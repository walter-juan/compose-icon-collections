package com.woowla.compose.icon.collections.ionicons.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val OutlineGroup.BagAdd: ImageVector
    get() {
        if (_bagAdd != null) {
            return _bagAdd!!
        }
        _bagAdd = Builder(name = "BagAdd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                lineTo(256.0f, 384.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 320.0f)
                lineTo(192.0f, 320.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(80.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineTo(408.0f)
                curveToRelative(0.0f, 30.24f, 25.76f, 56.0f, 56.0f, 56.0f)
                horizontalLineTo(392.0f)
                curveToRelative(30.24f, 0.0f, 56.0f, -24.51f, 56.0f, -54.75f)
                verticalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(160.0f, 176.0f)
                verticalLineTo(144.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 96.0f, -96.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 96.0f, 96.0f)
                verticalLineToRelative(32.0f)
            }
        }
        .build()
        return _bagAdd!!
    }

private var _bagAdd: ImageVector? = null
