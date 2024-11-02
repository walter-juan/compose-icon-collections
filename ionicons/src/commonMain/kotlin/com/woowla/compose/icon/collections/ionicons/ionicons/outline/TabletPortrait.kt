package com.woowla.compose.icon.collections.ionicons.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.OutlineGroup

public val OutlineGroup.TabletPortrait: ImageVector
    get() {
        if (_tabletPortrait != null) {
            return _tabletPortrait!!
        }
        _tabletPortrait = Builder(name = "TabletPortrait", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 16.0f)
                lineTo(384.0f, 16.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 432.0f, 64.0f)
                lineTo(432.0f, 448.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 384.0f, 496.0f)
                lineTo(128.0f, 496.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 80.0f, 448.0f)
                lineTo(80.0f, 64.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 128.0f, 16.0f)
                close()
            }
        }
        .build()
        return _tabletPortrait!!
    }

private var _tabletPortrait: ImageVector? = null
