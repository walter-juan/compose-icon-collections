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

public val OutlineGroup.BrandZoom: ImageVector
    get() {
        if (_brandZoom != null) {
            return _brandZoom!!
        }
        _brandZoom = Builder(name = "BrandZoom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.011f, 9.385f)
                verticalLineToRelative(5.128f)
                lineToRelative(3.989f, 3.487f)
                verticalLineToRelative(-12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.887f, 6.0f)
                horizontalLineToRelative(10.08f)
                curveToRelative(1.468f, 0.0f, 3.033f, 1.203f, 3.033f, 2.803f)
                verticalLineToRelative(8.196f)
                arcToRelative(0.991f, 0.991f, 0.0f, false, true, -0.975f, 1.0f)
                horizontalLineToRelative(-10.373f)
                curveToRelative(-1.667f, 0.0f, -2.652f, -1.5f, -2.652f, -3.0f)
                lineToRelative(0.01f, -8.0f)
                arcToRelative(0.882f, 0.882f, 0.0f, false, true, 0.208f, -0.71f)
                arcToRelative(0.841f, 0.841f, 0.0f, false, true, 0.67f, -0.287f)
                close()
            }
        }
        .build()
        return _brandZoom!!
    }

private var _brandZoom: ImageVector? = null
