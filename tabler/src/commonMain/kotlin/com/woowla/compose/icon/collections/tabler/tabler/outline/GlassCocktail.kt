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

public val OutlineGroup.GlassCocktail: ImageVector
    get() {
        if (_glassCocktail != null) {
            return _glassCocktail!!
        }
        _glassCocktail = Builder(name = "GlassCocktail", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 21.0f)
                horizontalLineToRelative(8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                verticalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                moveToRelative(-7.0f, 0.0f)
                arcToRelative(7.0f, 2.0f, 0.0f, true, false, 14.0f, 0.0f)
                arcToRelative(7.0f, 2.0f, 0.0f, true, false, -14.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                verticalLineToRelative(0.388f)
                curveToRelative(0.0f, 0.432f, 0.126f, 0.853f, 0.362f, 1.206f)
                lineToRelative(5.0f, 7.509f)
                curveToRelative(0.633f, 0.951f, 1.88f, 1.183f, 2.785f, 0.517f)
                curveToRelative(0.191f, -0.141f, 0.358f, -0.316f, 0.491f, -0.517f)
                lineToRelative(5.0f, -7.509f)
                curveToRelative(0.236f, -0.353f, 0.362f, -0.774f, 0.362f, -1.206f)
                verticalLineToRelative(-0.388f)
            }
        }
        .build()
        return _glassCocktail!!
    }

private var _glassCocktail: ImageVector? = null
