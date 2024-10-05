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

public val OutlineGroup.Diaper: ImageVector
    get() {
        if (_diaper != null) {
            return _diaper!!
        }
        _diaper = Builder(name = "Diaper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 8.323f)
                curveToRelative(0.0f, -0.579f, 0.0f, -0.868f, 0.044f, -1.11f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, 2.17f, -2.169f)
                curveToRelative(0.239f, -0.044f, 0.529f, -0.044f, 1.109f, -0.044f)
                horizontalLineToRelative(11.353f)
                curveToRelative(0.579f, 0.0f, 0.868f, 0.0f, 1.11f, 0.044f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, 2.169f, 2.17f)
                curveToRelative(0.044f, 0.24f, 0.044f, 0.53f, 0.044f, 1.11f)
                verticalLineToRelative(2.676f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -18.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 9.0f)
                horizontalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 9.0f)
                horizontalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.25f, 19.7f)
                verticalLineToRelative(-1.4f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, 6.3f, -6.3f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.75f, 19.7f)
                verticalLineToRelative(-1.4f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, -6.3f, -6.3f)
            }
        }
        .build()
        return _diaper!!
    }

private var _diaper: ImageVector? = null
