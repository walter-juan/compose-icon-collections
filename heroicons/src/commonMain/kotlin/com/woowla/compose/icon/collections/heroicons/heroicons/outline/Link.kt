package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.19f, 8.688f)
                curveTo(13.639f, 8.903f, 14.06f, 9.196f, 14.432f, 9.568f)
                curveTo(16.189f, 11.325f, 16.189f, 14.175f, 14.432f, 15.932f)
                lineTo(9.932f, 20.432f)
                curveTo(8.175f, 22.189f, 5.325f, 22.189f, 3.568f, 20.432f)
                curveTo(1.811f, 18.675f, 1.811f, 15.825f, 3.568f, 14.068f)
                lineTo(5.325f, 12.311f)
                moveTo(18.675f, 11.689f)
                lineTo(20.432f, 9.932f)
                curveTo(22.189f, 8.175f, 22.189f, 5.325f, 20.432f, 3.568f)
                curveTo(18.675f, 1.811f, 15.825f, 1.811f, 14.068f, 3.568f)
                lineTo(9.568f, 8.068f)
                curveTo(7.811f, 9.825f, 7.811f, 12.675f, 9.568f, 14.432f)
                curveTo(9.94f, 14.804f, 10.361f, 15.097f, 10.81f, 15.312f)
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
