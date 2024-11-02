package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 428.0f)
                lineTo(339.92f, 303.9f)
                arcToRelative(160.48f, 160.48f, 0.0f, false, false, 30.72f, -94.58f)
                curveTo(370.64f, 120.37f, 298.27f, 48.0f, 209.32f, 48.0f)
                reflectiveCurveTo(48.0f, 120.37f, 48.0f, 209.32f)
                reflectiveCurveToRelative(72.37f, 161.32f, 161.32f, 161.32f)
                arcToRelative(160.48f, 160.48f, 0.0f, false, false, 94.58f, -30.72f)
                lineTo(428.0f, 464.0f)
                close()
                moveTo(209.32f, 319.69f)
                arcTo(110.38f, 110.38f, 0.0f, true, true, 319.69f, 209.32f)
                arcTo(110.5f, 110.5f, 0.0f, false, true, 209.32f, 319.69f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
