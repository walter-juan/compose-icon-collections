package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

public val OutlineGroup.Pool: ImageVector
    get() {
        if (_pool != null) {
            return _pool!!
        }
        _pool = Builder(name = "Pool", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 20.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, -1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.0f, -1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, -1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.0f, -1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, -1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 16.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, -1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.0f, -1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, -1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.0f, -1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, -1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                verticalLineToRelative(-7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                verticalLineToRelative(-7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 5.0f)
                lineToRelative(-6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 10.0f)
                lineToRelative(6.0f, 0.0f)
            }
        }
        .build()
        return _pool!!
    }

private var _pool: ImageVector? = null
