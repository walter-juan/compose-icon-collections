package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Formik: ImageVector
    get() {
        if (_formik != null) {
            return _formik!!
        }
        _formik = Builder(name = "Formik", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.545f, 10.295f)
                lineTo(17.792f, 8.712f)
                lineToRelative(0.001f, -3.3f)
                lineToRelative(2.753f, 1.582f)
                close()
                moveTo(20.544f, 13.884f)
                lineTo(17.792f, 12.302f)
                lineTo(17.793f, 9.149f)
                lineTo(20.545f, 10.731f)
                close()
                moveTo(20.57f, 17.516f)
                lineTo(17.784f, 15.915f)
                lineTo(17.786f, 12.762f)
                lineTo(20.572f, 14.363f)
                close()
                moveTo(13.418f, 11.009f)
                lineTo(17.416f, 8.711f)
                lineTo(17.416f, 5.559f)
                lineTo(13.419f, 7.857f)
                close()
                moveTo(10.943f, 15.992f)
                lineTo(17.4f, 12.281f)
                lineTo(17.401f, 9.128f)
                lineTo(10.943f, 12.84f)
                close()
                moveTo(6.601f, 22.135f)
                lineTo(17.423f, 15.914f)
                lineTo(17.423f, 12.762f)
                lineTo(6.601f, 18.983f)
                close()
                moveTo(9.59f, 24.0f)
                lineToRelative(-2.77f, -1.593f)
                lineToRelative(10.784f, -6.201f)
                lineToRelative(2.77f, 1.593f)
                close()
                moveTo(3.455f, 13.778f)
                lineTo(6.208f, 15.36f)
                lineToRelative(-0.001f, 3.361f)
                lineToRelative(-2.753f, -1.582f)
                close()
                moveTo(3.456f, 10.188f)
                lineTo(6.208f, 11.77f)
                lineTo(6.207f, 14.923f)
                lineTo(3.455f, 13.341f)
                close()
                moveTo(3.43f, 6.576f)
                lineTo(6.216f, 8.178f)
                lineTo(6.215f, 11.331f)
                lineTo(3.429f, 9.729f)
                close()
                moveTo(10.581f, 13.062f)
                lineTo(6.584f, 15.36f)
                lineToRelative(-0.0f, 3.152f)
                lineToRelative(3.997f, -2.298f)
                close()
                moveTo(13.057f, 8.079f)
                lineTo(6.599f, 11.791f)
                lineTo(6.599f, 14.943f)
                lineTo(13.056f, 11.231f)
                close()
                moveTo(17.415f, 1.927f)
                lineTo(6.576f, 8.157f)
                lineToRelative(-0.0f, 3.152f)
                lineTo(17.415f, 5.079f)
                close()
                moveTo(14.534f, 0.0f)
                lineToRelative(2.77f, 1.593f)
                lineTo(6.396f, 7.865f)
                lineTo(3.626f, 6.273f)
                close()
            }
        }
        .build()
        return _formik!!
    }

private var _formik: ImageVector? = null
