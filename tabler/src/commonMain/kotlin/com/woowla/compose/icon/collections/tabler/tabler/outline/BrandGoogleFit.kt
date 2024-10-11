package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.BrandGoogleFit: ImageVector
    get() {
        if (_brandGoogleFit != null) {
            return _brandGoogleFit!!
        }
        _brandGoogleFit = Builder(name = "BrandGoogleFit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.866f)
                lineToRelative(-2.733f, -2.734f)
                arcToRelative(3.866f, 3.866f, 0.0f, false, false, -5.467f, 5.467f)
                lineToRelative(2.733f, 2.734f)
                lineToRelative(5.467f, 5.467f)
                lineToRelative(8.202f, -8.201f)
                arcToRelative(3.866f, 3.866f, 0.0f, false, false, -5.469f, -5.466f)
                lineToRelative(-8.201f, 8.2f)
            }
        }
        .build()
        return _brandGoogleFit!!
    }

private var _brandGoogleFit: ImageVector? = null
