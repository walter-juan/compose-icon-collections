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

public val OutlineGroup.FingerPrint: ImageVector
    get() {
        if (_fingerPrint != null) {
            return _fingerPrint!!
        }
        _fingerPrint = Builder(name = "FingerPrint", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.864f, 4.243f)
                curveTo(9.05f, 3.457f, 10.471f, 3.0f, 12.0f, 3.0f)
                curveTo(16.142f, 3.0f, 19.5f, 6.358f, 19.5f, 10.5f)
                curveTo(19.5f, 13.419f, 18.944f, 16.209f, 17.932f, 18.768f)
                moveTo(5.743f, 6.364f)
                curveTo(4.957f, 7.55f, 4.5f, 8.971f, 4.5f, 10.5f)
                curveTo(4.5f, 11.968f, 4.079f, 13.337f, 3.35f, 14.493f)
                moveTo(5.339f, 18.052f)
                curveTo(7.148f, 16.056f, 8.25f, 13.406f, 8.25f, 10.5f)
                curveTo(8.25f, 8.429f, 9.929f, 6.75f, 12.0f, 6.75f)
                curveTo(14.071f, 6.75f, 15.75f, 8.429f, 15.75f, 10.5f)
                curveTo(15.75f, 11.027f, 15.729f, 11.549f, 15.686f, 12.065f)
                moveTo(12.0f, 10.5f)
                curveTo(12.0f, 14.223f, 10.644f, 17.628f, 8.399f, 20.251f)
                moveTo(15.033f, 15.654f)
                curveTo(14.485f, 17.574f, 13.639f, 19.368f, 12.548f, 20.984f)
            }
        }
        .build()
        return _fingerPrint!!
    }

private var _fingerPrint: ImageVector? = null
