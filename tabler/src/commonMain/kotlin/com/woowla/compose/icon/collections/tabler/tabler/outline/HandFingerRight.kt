package com.woowla.compose.icon.collections.tabler.tabler.outline

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
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.HandFingerRight: ImageVector
    get() {
        if (_handFingerRight != null) {
            return _handFingerRight!!
        }
        _handFingerRight = Builder(name = "HandFingerRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                horizontalLineToRelative(8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-7.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 11.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-2.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-1.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                verticalLineToRelative(-2.0f)
                verticalLineToRelative(0.208f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.7f, -5.012f)
                lineToRelative(0.3f, -0.196f)
                quadToRelative(0.718f, -0.468f, 5.728f, -3.286f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.022f, 0.536f)
                curveToRelative(0.44f, 0.734f, 0.325f, 1.674f, -0.28f, 2.28f)
                lineToRelative(-1.47f, 1.47f)
            }
        }
        .build()
        return _handFingerRight!!
    }

private var _handFingerRight: ImageVector? = null
