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

public val OutlineGroup.BrandMongodb: ImageVector
    get() {
        if (_brandMongodb != null) {
            return _brandMongodb!!
        }
        _brandMongodb = Builder(name = "BrandMongodb", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                verticalLineToRelative(19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 11.227f)
                curveToRelative(0.0f, 3.273f, -1.812f, 4.77f, -6.0f, 9.273f)
                curveToRelative(-4.188f, -4.503f, -6.0f, -6.0f, -6.0f, -9.273f)
                curveToRelative(0.0f, -4.454f, 3.071f, -6.927f, 6.0f, -9.227f)
                curveToRelative(2.929f, 2.3f, 6.0f, 4.773f, 6.0f, 9.227f)
                close()
            }
        }
        .build()
        return _brandMongodb!!
    }

private var _brandMongodb: ImageVector? = null
