package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CakeFill: ImageVector
    get() {
        if (_cakeFill != null) {
            return _cakeFill!!
        }
        _cakeFill = Builder(name = "CakeFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.399f, 0.804f)
                lineToRelative(0.595f, -0.792f)
                lineToRelative(0.598f, 0.79f)
                arcTo(0.747f, 0.747f, 0.0f, false, true, 8.5f, 1.806f)
                lineTo(8.5f, 4.0f)
                lineTo(11.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(1.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(3.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(2.5f)
                lineTo(7.5f, 1.813f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.101f, -1.01f)
                close()
                moveTo(12.0f, 6.414f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, -0.646f, -0.268f)
                arcToRelative(1.914f, 1.914f, 0.0f, false, false, -2.708f, 0.0f)
                arcToRelative(0.914f, 0.914f, 0.0f, false, true, -1.292f, 0.0f)
                arcToRelative(1.914f, 1.914f, 0.0f, false, false, -2.708f, 0.0f)
                arcTo(0.9f, 0.9f, 0.0f, false, true, 4.0f, 6.414f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.49f, 0.0f, 0.98f, -0.187f, 1.354f, -0.56f)
                arcToRelative(0.914f, 0.914f, 0.0f, false, true, 1.292f, 0.0f)
                curveToRelative(0.748f, 0.747f, 1.96f, 0.747f, 2.708f, 0.0f)
                arcToRelative(0.914f, 0.914f, 0.0f, false, true, 1.292f, 0.0f)
                curveToRelative(0.374f, 0.373f, 0.864f, 0.56f, 1.354f, 0.56f)
                close()
                moveTo(14.646f, 12.146f)
                arcToRelative(0.914f, 0.914f, 0.0f, false, true, -1.293f, 0.0f)
                arcToRelative(1.914f, 1.914f, 0.0f, false, false, -2.707f, 0.0f)
                arcToRelative(0.914f, 0.914f, 0.0f, false, true, -1.292f, 0.0f)
                arcToRelative(1.914f, 1.914f, 0.0f, false, false, -2.708f, 0.0f)
                arcToRelative(0.914f, 0.914f, 0.0f, false, true, -1.292f, 0.0f)
                arcToRelative(1.914f, 1.914f, 0.0f, false, false, -2.708f, 0.0f)
                arcToRelative(0.914f, 0.914f, 0.0f, false, true, -1.292f, 0.0f)
                lineTo(1.0f, 11.793f)
                verticalLineToRelative(1.34f)
                curveToRelative(0.737f, 0.452f, 1.715f, 0.36f, 2.354f, -0.28f)
                arcToRelative(0.914f, 0.914f, 0.0f, false, true, 1.292f, 0.0f)
                curveToRelative(0.748f, 0.748f, 1.96f, 0.748f, 2.708f, 0.0f)
                arcToRelative(0.914f, 0.914f, 0.0f, false, true, 1.292f, 0.0f)
                curveToRelative(0.748f, 0.748f, 1.96f, 0.748f, 2.707f, 0.0f)
                arcToRelative(0.914f, 0.914f, 0.0f, false, true, 1.293f, 0.0f)
                arcToRelative(1.915f, 1.915f, 0.0f, false, false, 2.354f, 0.28f)
                verticalLineToRelative(-1.34f)
                close()
            }
        }
        .build()
        return _cakeFill!!
    }

private var _cakeFill: ImageVector? = null
