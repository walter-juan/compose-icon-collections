package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.SmileyFrustrated16: ImageVector
    get() {
        if (_smileyFrustrated16 != null) {
            return _smileyFrustrated16!!
        }
        _smileyFrustrated16 = Builder(name = "SmileyFrustrated16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(7.996f, 7.996f, 0.0f, false, true, 8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                close()
                moveTo(8.0f, 1.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.0f, -13.0f)
                close()
                moveTo(8.0f, 8.25f)
                curveToRelative(2.487f, 0.0f, 3.518f, 1.98f, 3.727f, 2.818f)
                arcTo(0.751f, 0.751f, 0.0f, false, true, 11.0f, 12.0f)
                lineTo(5.0f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.728f, -0.932f)
                curveTo(4.482f, 10.23f, 5.513f, 8.25f, 8.0f, 8.25f)
                close()
                moveTo(11.259f, 4.396f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, true, 0.482f, 1.208f)
                lineTo(10.75f, 6.0f)
                lineToRelative(0.991f, 0.396f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, true, -0.482f, 1.208f)
                lineTo(8.99f, 6.696f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.392f)
                close()
                moveTo(3.896f, 4.759f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, true, 0.845f, -0.363f)
                lineToRelative(2.268f, 0.908f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.392f)
                lineToRelative(-2.268f, 0.908f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, true, -0.483f, -1.208f)
                lineTo(5.25f, 6.0f)
                lineToRelative(-0.992f, -0.396f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, true, -0.362f, -0.845f)
                close()
                moveTo(8.0f, 9.75f)
                curveToRelative(-0.822f, 0.0f, -1.383f, 0.351f, -1.746f, 0.75f)
                horizontalLineToRelative(3.492f)
                curveToRelative(-0.363f, -0.399f, -0.924f, -0.75f, -1.746f, -0.75f)
                close()
            }
        }
        .build()
        return _smileyFrustrated16!!
    }

private var _smileyFrustrated16: ImageVector? = null
