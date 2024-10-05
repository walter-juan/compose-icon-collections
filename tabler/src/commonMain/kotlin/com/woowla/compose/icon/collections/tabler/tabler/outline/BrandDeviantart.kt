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

public val OutlineGroup.BrandDeviantart: ImageVector
    get() {
        if (_brandDeviantart != null) {
            return _brandDeviantart!!
        }
        _brandDeviantart = Builder(name = "BrandDeviantart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 3.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(-3.857f, 6.0f)
                horizontalLineToRelative(3.857f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-6.429f)
                lineToRelative(-2.571f, 4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                lineToRelative(3.857f, -6.0f)
                horizontalLineToRelative(-3.857f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(6.429f)
                lineToRelative(2.571f, -4.0f)
                close()
            }
        }
        .build()
        return _brandDeviantart!!
    }

private var _brandDeviantart: ImageVector? = null
