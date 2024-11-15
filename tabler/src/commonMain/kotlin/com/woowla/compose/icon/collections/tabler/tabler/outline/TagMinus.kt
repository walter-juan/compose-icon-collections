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

public val OutlineGroup.TagMinus: ImageVector
    get() {
        if (_tagMinus != null) {
            return _tagMinus!!
        }
        _tagMinus = Builder(name = "TagMinus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 7.5f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.898f, 16.102f)
                lineToRelative(0.699f, -0.699f)
                lineToRelative(0.699f, -0.699f)
                curveToRelative(0.941f, -0.941f, 0.941f, -2.467f, 0.0f, -3.408f)
                lineToRelative(-7.71f, -7.71f)
                curveToRelative(-0.375f, -0.375f, -0.884f, -0.586f, -1.414f, -0.586f)
                horizontalLineToRelative(-5.172f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(5.172f)
                curveToRelative(0.0f, 0.53f, 0.211f, 1.039f, 0.586f, 1.414f)
                lineToRelative(7.71f, 7.71f)
                curveToRelative(0.471f, 0.47f, 1.087f, 0.706f, 1.704f, 0.706f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(6.0f)
            }
        }
        .build()
        return _tagMinus!!
    }

private var _tagMinus: ImageVector? = null
